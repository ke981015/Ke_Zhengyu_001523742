package Business;

/**
 *
 * @author Ke
 */
public class Listings {
    private String fileID;
    private String name;
    private String link;
    private long createTime;
    private long updateTime;

    public Listings(String fileID, String name, String link) {
        this.fileID = fileID;
        this.name = name;
        this.link = link;
    }

    public Listings(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public Listings(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileID() {
        return fileID;
    }

    public void setFileID(String fileID) {
        this.fileID = fileID;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
