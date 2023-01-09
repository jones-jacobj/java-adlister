import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ColorPickerServlet", urlPatterns = "/color-pick")
public class ColorPickerServlet extends HttpServlet {
    String color;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        color = "white";
        req.setAttribute("background",color);
        req.getRequestDispatcher("colorPick.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        color = req.getParameter("color");
        req.setAttribute("background",color);
        req.getRequestDispatcher("colorPick.jsp").forward(req,resp);
    }
}
