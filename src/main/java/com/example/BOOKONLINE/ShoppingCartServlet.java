package com.example.BOOKONLINE;

import com.example.BOOKONLINE.Utils.SongUtils;
import com.example.BOOKONLINE.model.Song;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ShoppingCartServlet", urlPatterns = "/shopping-cart")

public class ShoppingCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String refer = request.getHeader("referer");
        int num = Integer.parseInt(refer.substring(refer.lastIndexOf("/") + 9));
        Song song = SongUtils.getSongByID(num);
        request.setAttribute("song", song);
        request.getRequestDispatcher("shoppingCart.jsp").forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
