/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.hewan;

/**
 *
 * @author PC PRAKTIKUM
 */
public class hewancontroller {
   (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOEException {
        try(Session session = HibernateUntil.getSessionFactory().openSession()) {
                Query<Hewan> query = session.createQuery("FROM Hewan", Hewan.class);
                List<Hewan> hewanList = query.list();
                request.setAttribut("hewan", hewan);
                request.getReque("/hewan.jsp");
        }
   }
}