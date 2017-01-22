package garden.businesslogic;

import garden.businessentity.LoggedUser;
import garden.businessentity.Tool;
import garden.entity.Employee;
import garden.entity.Menu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import garden.businesslogic.interfaces.IUserLogicLocal;
import logic.data.CustomHashMap;

@Stateless(name = "UserLogic", mappedName = "garden.businesslogic.UserLogic")
public class UserLogic extends logic.SuperBusinessLogic implements
		garden.businesslogic.interfaces.IUserLogic, IUserLogicLocal {

	@Resource
	SessionContext sessionContext;

	public UserLogic() {

	}

	public void setDataBaseInfo() throws Exception {
		// dataBaseName = "garden"
	}

	@Override
	public void logicTest() throws Exception {
		List<Menu> menus = new ArrayList<Menu>();
		menus = getAll(Menu.class);
		System.out.println(menus.size());
	}

	@Override
	public LoggedUser login(LoggedUser loggedUser) throws Exception {

		CustomHashMap parameters = new CustomHashMap();
		StringBuilder jpql = new StringBuilder();
		parameters.put("id", loggedUser.getUsername());
		parameters.put("password", Tool.MD5(loggedUser.getPassword()));

		System.out.println("MD% : " + Tool.MD5(loggedUser.getPassword()));

		jpql.append("SELECT NEW garden.businessentity.LoggedUser(a, b) FROM Users a ");
		jpql.append("INNER JOIN Organization b ON b.pkId = a.organizationPkId ");

		jpql.append(" WHERE a.id = :id AND a.password = :password ");

		List<LoggedUser> list = getByQuery(LoggedUser.class, jpql.toString(), parameters);

		if (list.size() < 1) {
			throw new Exception("NONE");
		} 
		List<Employee> employees = getByAnyField(Employee.class, "userPkId", list.get(0).getUser().getPkId());
		if(employees.size() > 0) {
			list.get(0).setEmployee(employees.get(0));
		}else {
			throw new Exception("Тухайн х�?р�?гл�?гч д�?�?р ажилтан тохируулаагүй байна.");
		}

		return list.get(0);
	}
	
	@Override
	public List<Menu> getMenusFilter(LoggedUser loggedUser) throws Exception {

		StringBuilder jpql = new StringBuilder();
		BigDecimal bigDecimal = loggedUser.getUser().getPkId();
		CustomHashMap parameters = new CustomHashMap();

		parameters.put("bigDecimal", bigDecimal);
		jpql = new StringBuilder();
		jpql.append("SELECT b.menuPkId FROM UserRoleMap a ");
		jpql.append("INNER JOIN RoleMenuMap b ON a.rolePkId = b.rolePkId ");
		jpql.append("WHERE a.userPkId = :bigDecimal ");

		List<BigDecimal> bigDecimals = getByQuery(BigDecimal.class,
				jpql.toString(), parameters);
		parameters.put("list", bigDecimals);

		jpql = new StringBuilder();
		jpql.append("SELECT a FROM Menu a ");
		jpql.append("WHERE a.pkId NOT IN :list ");

		List<Menu> list = getByQuery(Menu.class, jpql.toString(), parameters);
		return list;
	}
	
	@Override
	public List<Menu> getMenus(LoggedUser loggedUser) throws Exception {

		StringBuilder jpql = new StringBuilder();
		BigDecimal bigDecimal = loggedUser.getUser().getPkId();
		CustomHashMap parameters = new CustomHashMap();

		parameters.put("bigDecimal", bigDecimal);
		jpql = new StringBuilder();
		jpql.append("SELECT b.menuPkId FROM UserRoleMap a ");
		jpql.append("INNER JOIN RoleMenuMap b ON a.rolePkId = b.rolePkId ");
		jpql.append("WHERE a.userPkId = :bigDecimal ");

		List<BigDecimal> bigDecimals = getByQuery(BigDecimal.class,
				jpql.toString(), parameters);
		parameters.put("list", bigDecimals);

		jpql = new StringBuilder();
		jpql.append("SELECT a FROM Menu a ");
		jpql.append("WHERE a.pkId IN ( ");
		jpql.append("SELECT MIN(b.pkId) FROM Menu b ");
		jpql.append("GROUP BY b.sort ");
		jpql.append(") AND a.pkId IN :list ");
		jpql.append("ORDER BY a.sort ");
		
		List<Menu> list = getByQuery(Menu.class, jpql.toString(), parameters);
		return list;
	}
	
	@Override
	public List<Menu> getMenus() throws Exception {

		StringBuilder jpql = new StringBuilder();
		jpql.append("SELECT a FROM Menu a ");

		List<Menu> list = getByQuery(Menu.class, jpql.toString(), null);
		return list;
	}
	
	@Override
	public List<Menu> getListMenus(LoggedUser loggedUser) throws Exception {
		StringBuilder jpql = new StringBuilder();
		CustomHashMap parameters = new CustomHashMap();

		parameters.put("userPkId", loggedUser.getUser().getPkId());
		jpql.append("SELECT DISTINCT a FROM Menu a ");
		jpql.append("INNER JOIN RoleMenuMap b ON b.menuPkId = a.pkId ");
		jpql.append("INNER JOIN UserRoleMap c ON c.rolePkId = b.rolePkId ");
		jpql.append("WHERE c.userPkId = :userPkId ");

		return getByQuery(Menu.class, jpql.toString(), parameters);
	}

}
