package iphone_manage.dao;

import iphone_manage.entity.Iphone;

import java.util.List;

public interface Phone_dao {
    List<Iphone> getphonelist();
    int getphoneadd(Iphone iphone);
    int getphonedel(int i);
    int getphoneupdate(Iphone iphone);
    List<Iphone> getphonefind(String s);
    List<Iphone> getphonefindID(int i);

}
