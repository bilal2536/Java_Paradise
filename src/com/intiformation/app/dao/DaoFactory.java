package com.intiformation.app.dao;

import com.intiformation.app.dao.jdbc.JdbcPlaceDao;
import com.intiformation.app.dao.jdbc.JdbcTripDao;

public class DaoFactory {

    private DaoFactory() {

    }

    public static JdbcTripDao getTripDao() {
        return new JdbcTripDao();
    }

    public static JdbcPlaceDao getPlaceDao() {
        return new JdbcPlaceDao();
    }

}
