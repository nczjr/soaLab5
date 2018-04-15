import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConverterServlet")
public class ConverterServlet extends HttpServlet {

    @EJB
    ConverterBean converterBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double temperature = Double.parseDouble(request.getParameter("temperature"));
        double result = 0;

        result = request.getParameter("fahrs2Cels") != null ? converterBean.Fahr2Cels(temperature) : converterBean.Cels2Fahr(temperature);

        response.getWriter().print(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
