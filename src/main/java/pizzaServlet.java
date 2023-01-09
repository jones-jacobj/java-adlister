import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="pizzaServlet" , urlPatterns="/pizza-order")
public class pizzaServlet extends HttpServlet {

    String top1Value;
    String top2Value;

    protected void updateValues(String top1Value, String top2Value, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("top1Val",top1Value);
        req.setAttribute("top2Val",top2Value);
        req.getRequestDispatcher("pizza.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (top1Value == null){
            top1Value = "Cheese";
        }
        if (top2Value == null){
            top2Value = "Cheese";
        }
        updateValues(top1Value,top2Value,req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        top1Value = req.getParameter("top1");
        top2Value = req.getParameter("top2");
        updateValues(top1Value,top2Value,req,resp);
    }
}
