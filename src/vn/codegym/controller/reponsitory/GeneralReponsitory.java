package vn.codegym.controller.reponsitory;

import java.util.List;

public interface GeneralReponsitory<E> {
    List<E> findAll();
}
