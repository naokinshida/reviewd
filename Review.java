package com.example.nagoyameshi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Storeinfo storeInfo;  // Storeinfo エンティティへの参照
    
    private int storeId;
    private String comment;
    private int star;

    // デフォルトコンストラクタ
    public Review() {}

    // すべてのフィールドを含むコンストラクタ
    public Review(Integer id, int storeId, String comment, int star) {
        this.id = id;
        this.storeId = storeId;
        this.comment = comment;
        this.star = star;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public Storeinfo getStoreInfo() {
        return storeInfo;
    }

    public void setStoreInfo(Storeinfo storeInfo) {
        this.storeInfo = storeInfo;
    }
}