package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBlog<M extends BaseBlog<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setHead(java.lang.String head) {
		set("head", head);
		return (M)this;
	}

	public java.lang.String getHead() {
		return get("head");
	}

	public M setPaper(java.lang.String paper) {
		set("paper", paper);
		return (M)this;
	}

	public java.lang.String getPaper() {
		return get("paper");
	}

}
