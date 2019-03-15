package com.easywork.wx.model.analysis.user.portrait;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 01:17
 * Description:
 */
public class UV {

    private Integer id;

    private String name;

    private int access_source_visit_uv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccess_source_visit_uv() {
        return access_source_visit_uv;
    }

    public void setAccess_source_visit_uv(int access_source_visit_uv) {
        this.access_source_visit_uv = access_source_visit_uv;
    }

    @Override
    public String toString() {
        return "UV{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", access_source_visit_uv=" + access_source_visit_uv +
                '}';
    }

}
