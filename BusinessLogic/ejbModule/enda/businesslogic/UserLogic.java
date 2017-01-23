package enda.businesslogic;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import logic.data.CustomHashMap;
import logic.data.Tools;
import enda.businesslogic.interfaces.IUserLogicLocal;
import enda.entity.Anket;
import enda.entity.UserPFile;
import enda.entity.Users;
import enda.entity.z_horoo;
import enda.entity.z_middistrict;
import enda.entity.z_sym;
@Stateless(name = "UserLogic", mappedName = "enda.businesslogic.UserLogic")
public class UserLogic extends logic.SuperBusinessLogic implements
		enda.businesslogic.interfaces.IUserLogic, IUserLogicLocal {

	@Resource
	SessionContext sessionContext;

	public UserLogic() {

	}

	public void setDataBaseInfo() throws Exception {
		// dataBaseName = "DentalHospital"
	}

	@Override
	public void logicTest() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void saveUser(Users user) throws Exception {
		if(BigDecimal.ZERO.compareTo(user.getPkId()) == 0) {
			//New WEB user
			user.setPkId(Tools.newPkId());
			insert(user);
		}
	}
	
	public Users login(String email) throws Exception{
		StringBuilder jpql = new StringBuilder();
		CustomHashMap parameters = new CustomHashMap();
		parameters.put("email", email);
		
		jpql.append("SELECT a FROM Users a ");
		jpql.append("WHERE a.email = :email  ");
		
		List<Users> list = getByQuery(Users.class, jpql.toString(), parameters);
		if(list == null || list.size() < 1) throw new Exception("Ийм хаягаар бүртгэл байхгүй байна !!!");
		
		return list.get(0);
	}
	
	public void saveAnket2(Anket anket) throws Exception{
		StringBuilder jpql = new StringBuilder();
		CustomHashMap parameters = new CustomHashMap();
		parameters.put("param", 99);
		
		jpql = new StringBuilder();
		jpql.append("SELECT a FROM Anket a ");
		jpql.append("WHERE a.ucompid = :param ");
		jpql.append("ORDER BY a.uregid DESC ");
		
		List<UserPFile> files = new ArrayList<UserPFile>();
		
		List<Anket> ankets = getByQuery(Anket.class, jpql.toString(), parameters);
		if(ankets.size() > 0) {
//			anket.setId(ankets.get(0).getId() + 1);
			anket.setUregid(addUserRegId(ankets.get(0).getUregid()));
			anket.setUserid(""+((new Date()).getYear()%100)+"-99-"+anket.getUregid());
			anket.setUyear(((new Date()).getYear()%100));
			anket.setHuselt_ognoo(new Date());
			anket.setUcompid(99);
			anket.setAddress(anket.getAimagid()+""+anket.getSymid()+""+anket.getHorooid()+""+anket.getMiddistid());
		}else {
//			anket.setId(1);
			anket.setUregid("0001");
			anket.setUserid(""+((new Date()).getYear()%100)+"-99-0001");
			anket.setUyear(((new Date()).getYear()%100));
			anket.setHuselt_ognoo(new Date());
			anket.setUcompid(99);
			anket.setAddress(anket.getAimagid()+""+anket.getSymid()+""+anket.getHorooid()+""+anket.getMiddistid());
		}
		
		List<UserPFile> files2 = getByQuery(UserPFile.class, "SELECT a FROM UserPFile a ORDER BY a.UserID DESC ", parameters);
		int i = 0;
		if(files2.size() > 0) i = files2.size();
		if(anket.getImage1() != null && anket.getImage1().length > 10) {files.add(userFile(i + 1,anket, anket.getImage1(), 1));}
		if(anket.getImage2() != null && anket.getImage2().length > 10) {files.add(userFile(i + 2,anket, anket.getImage2(), 2));}
		if(anket.getImage3() != null && anket.getImage3().length > 10) {files.add(userFile(i + 3,anket, anket.getImage3(), 3));}
		if(anket.getImage4() != null && anket.getImage4().length > 10) {files.add(userFile(i + 4,anket, anket.getImage4(), 4));}
		if(anket.getImage5() != null && anket.getImage5().length > 10) {files.add(userFile(i + 5,anket, anket.getImage5(), 5));}
		if(anket.getImage6() != null && anket.getImage6().length > 10) {files.add(userFile(i + 6,anket, anket.getImage6(), 6));}
		if(anket.getImage7() != null && anket.getImage7().length > 10) {files.add(userFile(i + 7,anket, anket.getImage7(), 7));}
		if(anket.getImage8() != null && anket.getImage8().length > 10) {files.add(userFile(i + 8,anket, anket.getImage8(), 8));}
		if(anket.getImage9() != null && anket.getImage9().length > 10) {files.add(userFile(i + 9,anket, anket.getImage9(), 9));}
		if(anket.getImage10() != null && anket.getImage10().length > 10) {files.add(userFile(i + 10,anket, anket.getImage10(), 10));}
		
		insert(anket);
		insert(files);
	}
	
	public UserPFile userFile(int pId, Anket anket, byte[] image, int type) {
		UserPFile file = new UserPFile();
		file.setUserID(anket.getUserid());
		file.setPTypeID(type);
		file.setDugaar(anket.getUserid());
		file.setRegDate(new Date());
		file.setPFilePic(image);
		return file;
	}
	
	public String addUserRegId(String str) {
		int s = Integer.parseInt(str);
		s++;
		String ret = (s < 10 ? "000" : (s < 100) ? "00" : (s < 1000 ? "0" : "" ) ) + s;
		return ret;
	}
	
	public List<z_sym> getListSym(String aimagId) throws Exception{
		if(aimagId == null || aimagId.length() < 1) return new ArrayList<z_sym>();
		StringBuilder jpql = new StringBuilder();
		CustomHashMap parameters = new CustomHashMap();
		
		parameters.put("symID", aimagId);
		
		jpql.append("SELECT a FROM z_sym a ");
		jpql.append("WHERE a.aimagID = :symID ");
		
		List<z_sym> list = getByQuery(z_sym.class, jpql.toString(), parameters);
		
		return list;
	}
	public List<z_horoo> getListHoroo(String aimagId, String symId) throws Exception{
		if(aimagId == null || aimagId.length() < 1 || symId == null || symId.length() < 1) return new ArrayList<z_horoo>();
		StringBuilder jpql = new StringBuilder();
		CustomHashMap parameters = new CustomHashMap();
		
		parameters.put("aimagID", aimagId);
		parameters.put("symID", symId);
		
		jpql.append("SELECT a FROM z_horoo a ");
		jpql.append("WHERE a.aimagID = :aimagID ");
		jpql.append("AND a.symID = :symID ");
		
		List<z_horoo> horoos = getByQuery(z_horoo.class, jpql.toString(), parameters);
		
		return horoos;
	}
	public List<z_middistrict> getListMid(String aimagId, String symId) throws Exception{
		if(aimagId == null || aimagId.length() < 1 || symId == null || symId.length() < 1) return new ArrayList<z_middistrict>();
		StringBuilder jpql = new StringBuilder();
		CustomHashMap parameters = new CustomHashMap();
		
		parameters.put("aimagID", aimagId);
		parameters.put("symID", symId);
		
		jpql.append("SELECT a FROM z_middistrict a ");
		jpql.append("WHERE a.aimagID = :aimagID ");
		jpql.append("AND a.symID = :symID ");
		
		List<z_middistrict> list = getByQuery(z_middistrict.class, jpql.toString(), parameters);
		
		return list;
	}

}
