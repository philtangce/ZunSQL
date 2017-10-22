package npu.zunsql.ve;

import java.lang.reflect.Array;

public class QueryResult
{
    private int colSize;
    private int rowSize;
    private String[][] res;
    private String[] header;

    public int getColSize()
    {
        return colSize;
    }

    public int getRowSize()
    {
        return rowSize;
    }

    public String[][] getRes()
    {
        return res;
    }

    public String[] getHeader()
    {
        return header;
    }

    public void setColSize(int colSize)
    {
        this.colSize = colSize;
    }

    public void setRowSize(int rowSize)
    {
        this.rowSize = rowSize;
    }

    public void setRes(String[][] res)
    {
        this.res = res;
    }

    public void setHeader(String[] header)
    {
        this.header = header;
    }
}
