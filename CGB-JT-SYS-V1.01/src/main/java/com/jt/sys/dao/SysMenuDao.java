package com.jt.sys.dao;

import java.util.List;
import java.util.Map;

public interface SysMenuDao {
	/**
	 * 查询所有菜单以及上级菜单信息(菜单名) 
	 * @return
	 */
	List<Map<String,Object>> findObjects();
}
