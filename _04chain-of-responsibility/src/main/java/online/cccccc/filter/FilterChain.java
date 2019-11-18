package online.cccccc.filter;

import online.cccccc.dto.Request;
import online.cccccc.dto.Response;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 10:36
 */
public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<>();
    private  int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index<filters.size()){
            filters.get(index++).doFilter(request,response,chain);
        }
    }

}

