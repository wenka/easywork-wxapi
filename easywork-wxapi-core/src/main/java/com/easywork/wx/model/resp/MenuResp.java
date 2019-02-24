package com.easywork.wx.model.resp;

import com.easywork.wx.model.menu.Conditionalmenu;
import com.easywork.wx.model.menu.Menu;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 02:19
 * Description:
 */
public class MenuResp{

    private Menu menu;
    private List<Conditionalmenu> conditionalmenu;
//
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


    public List<Conditionalmenu> getConditionalmenu() {
        return conditionalmenu;
    }

    public void setConditionalmenu(List<Conditionalmenu> conditionalmenu) {
        this.conditionalmenu = conditionalmenu;
    }

    @Override
    public String toString() {
        return "MenuResp{" +
                "menu=" + menu +
                ", conditionalmenu=" + conditionalmenu +
                "} " + super.toString();
    }
}
