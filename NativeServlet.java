import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NativeServlet extends HttpServlet {
	public NativeServlet() {
			System.load("/root/native-servlet/total.so");
	}
	
	@Override
	public void service(HttpServletRequest request,
						HttpServletResponse response) {
		try {
			String number = request.getParameter("number");
			double value = Double.parseDouble(number);
			java.io.PrintWriter out = response.getWriter();
			Common c = new Common();
			out.print( c.getTotal(value) );
		} catch (Exception e) { }
	}
}

class Common {
	native double getTotal(double x);
}