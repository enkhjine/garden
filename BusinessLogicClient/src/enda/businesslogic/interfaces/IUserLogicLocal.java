package enda.businesslogic.interfaces;

import java.util.List;

import javax.ejb.Local;

import enda.entity.Anket;
import enda.entity.Users;
import enda.entity.z_horoo;
import enda.entity.z_middistrict;
import enda.entity.z_sym;

@Local
public interface IUserLogicLocal {
	public void logicTest() throws Exception;
	public void saveUser(Users user) throws Exception;
	public Users login(String email) throws Exception;
	public List<z_sym> getListSym(String aimagId) throws Exception;
	public List<z_horoo> getListHoroo(String aimagId, String symId) throws Exception;
	public List<z_middistrict> getListMid(String aimagId, String symId) throws Exception;
	public <T> List<T> getAll(Class<T> type) throws Exception;
	
	public void saveAnket2(Anket anket) throws Exception;
}
