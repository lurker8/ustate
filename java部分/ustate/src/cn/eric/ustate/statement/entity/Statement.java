package cn.eric.ustate.statement.entity;

import java.io.Serializable;
import java.util.Date;

import cn.eric.ustate.profile.entity.Profile;

public class Statement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7502394279912533571L;

	//���
	private Integer id;
	//����
    private String content;
    //����ʱ��
    private Date createtime;
    //������
    private Profile profile;
    //������
    private int commentCount;
    //ϲ����
	private int likeCount;
    //��¼���û��Ƿ�ϲ��
    private int liked;
	//�Ƿ�Ϊ��������
	private int sercret;
	//�Ƿ�Ϊ����
	private int author;

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Statement [id=" + id + ", content=" + content + ", createtime="
				+ createtime + ", profile=" + profile + ", commentCount="
				+ commentCount + ", likeCount=" + likeCount + ", liked="
				+ liked + ", sercret=" + sercret + ", author=" + author + "]";
	}

}