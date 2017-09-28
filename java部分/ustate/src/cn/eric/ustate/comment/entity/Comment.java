package cn.eric.ustate.comment.entity;

import java.io.Serializable;
import java.util.Date;

import cn.eric.ustate.profile.entity.Profile;

public class Comment implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8520117161081985769L;

	//���۱��
	private Integer id;
	//��������
    private String content;
    //����ʱ��
    private Date createtime;
    //������������
    private Integer stmtId;
    //������
    private Profile profile;
    //�Ƿ���������
    private int sercret;
    //��¼���û��Ƿ����
    private int liked;
    //������
    private int likeCount;
    //���۸���ӦԴ�ı�
    private String originContent;
    //�Ƿ�Ϊ����
    private int author;
    
    
	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public String getOriginContent() {
		if (originContent == null) {
			this.originContent = "";
		}
		return originContent;
	}

	public void setOriginContent(String originContent) {
		this.originContent = originContent;
	}

	public Comment(Integer id, String content, Date createtime, Integer stmtId,
			Profile profile) {
		super();
		this.id = id;
		this.content = content;
		this.createtime = createtime;
		this.stmtId = stmtId;
		this.profile = profile;
	}
	
	public Comment() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getStmtId() {
		if (stmtId == null) {
			this.stmtId = 0;
		}
		return stmtId;
	}
	public void setStmtId(Integer stmtId) {
		this.stmtId = stmtId;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public int getSercret() {
		return sercret;
	}
	public void setSercret(int sercret) {
		this.sercret = sercret;
	}
	public int getLiked() {
		return liked;
	}
	public void setLiked(int liked) {
		this.liked = liked;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", createtime="
				+ createtime + ", stmtId=" + stmtId + ", profile=" + profile
				+ ", sercret=" + sercret + ", liked=" + liked + ", likeCount="
				+ likeCount + ", originContent=" + originContent + ", author="
				+ author + "]";
	}
	
}