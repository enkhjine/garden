package garden.businesslogic.interfaces;

import garden.businessentity.LoggedUser;
import garden.entity.Menu;
import javax.ejb.Local;
import java.util.*;

@Local
public interface IUserLogicLocal {
	public void logicTest() throws Exception;
	public LoggedUser login(LoggedUser loggedUser) throws Exception;
	public List<Menu> getMenus(LoggedUser loggedUser) throws Exception;
	public List<Menu> getMenus() throws Exception;
	public List<Menu> getMenusFilter(LoggedUser loggedUser) throws Exception;
	public List<Menu> getListMenus(LoggedUser loggedUser) throws Exception;
}
