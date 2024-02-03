package com.sda.jdbc.model;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;


public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            List<City> cities = session.createQuery("from City where countryCode = 'ESP'", City.class).list();
            cities.forEach(city -> System.out.println(city.getName()));

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


        String dbUrl = "jdbc:postgresql://localhost:5432/world";
        String dbUser = "postgres";
        String dbPassword = "postgres";

        List<CountryInfo> countries = new ArrayList<>();

        String sql = "SELECT country.name, country.region, language\n" +
                "FROM countrylanguage\n" +
                "JOIN country\n" +
                "ON countrylanguage.countrycode = country.code\n" +
                "WHERE country.region = 'Caribbean'";
        // preparedStatement.setString(1, "Jagoda"); //wyszukanie uzytkownika

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String region = resultSet.getString("region");
                String language = resultSet.getString("language");

                countries.add(new CountryInfo(name, region, language));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        countries.forEach(System.out::println);
    }
}



