package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tqy on 15-11-27.
 */
public class QueryTool<T> {
    Integer limit;

    Integer page;// begin from 0

    boolean statCount;// stat count or not?

    int count = -1;// -1 is a mark; means not stat count;

    T params;

    List<String> orderBy;

    boolean isSuccess = true;

    Object result;
    /** 每页限制大小固定；这样在查询到最后一页的时候，我们不需要单独查询总条数，直接可以通过page和limit算出来； */
    boolean fixLimit;

    public boolean isFixLimit() {
        return fixLimit;
    }

    public void setFixLimit(boolean fixLimit) {
        this.fixLimit = fixLimit;
    }

    public Integer getFrom() {
        if (null == page || limit == null)
            return null;
        return (page - 1) * limit;
    }

    public int getLimit() {
        if(null==limit)
            limit = 1000;
        return limit;
    }

    public void setLimit(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("limit can not less than 0");
        }
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        if (page < 0)
            throw new IllegalArgumentException("the page can not be less than 0");
        if (page == 0)
            page = 1;
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    public List<String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String... orderBy) {
        if (orderBy != null && 0 != orderBy.length) {
            this.orderBy = new ArrayList<String>(orderBy.length);
            for (String s : orderBy) {
                this.orderBy.add(s);
            }
        }
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public boolean isStatCount() {
        if (null == page)
            page = 1;
        return statCount;
    }

    public void setStatCount(boolean statCount) {
        this.statCount = statCount;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
