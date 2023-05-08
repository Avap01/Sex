package lista10sessao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SalvarInformacoes")
public class Info extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Login login = new Login(username, password);
        InfoPessoal infoPessoal = new InfoPessoal(request.getParameter("nome"), request.getParameter("email"), Integer.parseInt(request.getParameter("idade")));
        InfoAcademica infoAcademica = new InfoAcademica(request.getParameter("curso"), Integer.parseInt(request.getParameter("ano")));
        InfoProfissional infoProfissional = new InfoProfissional(request.getParameter("empresa"), request.getParameter("cargo"));

        session.setAttribute("login", login);
        session.setAttribute("infoPessoal", infoPessoal);
        session.setAttribute("infoAcademica", infoAcademica);
        session.setAttribute("infoProfissional", infoProfissional);

        response.sendRedirect("sucesso.html");
    }
}