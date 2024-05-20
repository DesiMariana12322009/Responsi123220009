/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author PC PRAKTIKUM
 */
public class menucontroller {
     protected class LoginController extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOEException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            try(Session session = HibernateUntil.getSessionFactory().openSession()) {
                Query<User> query = session.createQuery("FROM User WHERE username = :username AND password = :password", User.class);
                query.setParameter("username", username);
                query.setParameter("password", password);
                User user = query.uniqueResult();
                
                if (user !=null) {
                  HttpSessiom httpsession = request.getSession();
                  httpsession.setAttribute("user", user);
                  response.sendRedirect("menu");
                  else{
                    response.sendRedirect("login");      
                          }
    }
}
        }
     }
}