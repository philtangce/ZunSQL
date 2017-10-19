package npu.zunsql.cache;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingDeque;

public class PageMgr
{
    protected static final String PREFIX_UNUSED_PAGE = "unused_page_";

    protected static final String PREFIX_DATA = "data_";

    //TODO: LOCK
    protected String dbName = null;

    //未被使用的页的字典：<页号，页>
    protected Map<Integer, Page> unusedMap = null;
    //未被使用的页队列
    protected Queue<Page> unusedQueue = null;


    //已被使用的页队列
    protected List<Page> usedList = null;
    //已被使用的页字典：<页号，页>
    protected ConcurrentMap<Integer, Page> pageMap = null;
    protected FileMgr fileMgr = null;


    public PageMgr(String dbName, FileMgr fileMgr)
    {
        this.dbName      = dbName;
        this.fileMgr     = fileMgr;

        this.unusedQueue = new LinkedBlockingDeque<Page>();
        this.usedList    = new ArrayList<Page>();
        this.pageMap     = new ConcurrentHashMap<Integer, Page>();
        this.unusedMap   = new HashMap<Integer, Page>();

    }


    /**将缓存区所有已被写入的页写回至文件
     *
     */
    public void flushData()
    {

    }

    /**将缓存区该页写入文件
     *
     */
    public void setPageBuffer(Page buffer)
    {

    }
    /**根据pageID，从磁盘中读取对应页
     //如果当前页已经被缓存入pageMap，直接获取
     //否则，从磁盘总读入
     *
     */
    public void getPageBuffer(int pageID)
    {

    }
    public void put(Page buffer){
        this.pageMap.put(buffer.pageID, buffer);
    }

    public Page pin(int pageID){
        return this.pageMap.get(pageID);
    }

    public Page unpin(int pageID){
        return this.pageMap.remove(pageID);
    }
}
