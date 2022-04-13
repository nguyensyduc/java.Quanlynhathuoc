/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface Dao<T> {
    List<T> getAll();
    List<T> getcateid(int cateid);
    int insert(T t);
    List<T> searh(T t);
    boolean update(T t);
    boolean delete(T t);
    boolean delete(int id);
}
