package iphone_manage.dao;

import iphone_manage.entity.Iphone;

import java.util.List;

public class realize_dao implements Phone_dao {
    //显示订单的方法
    @Override
    public List<Iphone> getphonelist() {
        String sql = "select * from iPhone";
        return  JDBCUtil.preparedQuery(Iphone.class,sql);
    }

    @Override
    public int getphoneadd(Iphone iphone) {
        String sql ="insert into iPhone values(?,?,?,?,?,?,?)";
        return JDBCUtil.preparedUpdate(sql,iphone.getId(),iphone.getName(),iphone.getDatetime(),iphone.getColor(),iphone.getPrice(),iphone.getStock(),iphone.getFirm());
    }

    @Override
    public int getphonedel(int i) {
       String sql = "delete  iPhone where id=?";
       return JDBCUtil.preparedUpdate(sql,i);
    }

    @Override
    public int getphoneupdate(Iphone iphone) {

        String sql = "update iPhone set id=?,name=?,datetime=?,color=?,price=?,stock=?,firm=? where id="+iphone.getId();
        return  JDBCUtil.preparedUpdate(sql,iphone.getId(),iphone.getName(),iphone.getDatetime(),iphone.getColor(),iphone.getPrice(),iphone.getStock(),iphone.getFirm());
    }

    @Override
    public List<Iphone> getphonefind(String name) {
        String sql = "select * from iPhone where name =?";
        return JDBCUtil.preparedQuery(Iphone.class,sql,name);
    }

    @Override
    public List<Iphone> getphonefindID(int i) {
        String sql = "select * from iPhone where id=?";
        return JDBCUtil.preparedQuery(Iphone.class,sql,i);
    }


}
