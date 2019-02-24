package com.easywork.wx.model.menu;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 03:23
 * Description:
 */
public class Conditionalmenu {
    private List<Button> button;
    private Matchrule matchrule;
    private long menuid;

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

    public Matchrule getMatchrule() {
        return matchrule;
    }

    public void setMatchrule(Matchrule matchrule) {
        this.matchrule = matchrule;
    }

    public long getMenuid() {
        return menuid;
    }

    public void setMenuid(long menuid) {
        this.menuid = menuid;
    }

    @Override
    public String toString() {
        return "Conditionalmenu{" +
                "button=" + button +
                ", matchrule=" + matchrule +
                ", menuid=" + menuid +
                '}';
    }
}
