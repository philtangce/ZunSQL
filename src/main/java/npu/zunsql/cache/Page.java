package npu.zunsql.cache;

public class Page
{
    public static final int HEAD_SIZE = 0;
    public static final int PAGE_SIZE = 1024;
    protected static final int NEW_PAGES_SIZE = 10;

    protected int pageID;


    public Page()
    {

    }
    public int getPageID()
    {
        return this.pageID;
    }
    public void setPageID(int pageID)
    {
        this.pageID = pageID;
    }

}
