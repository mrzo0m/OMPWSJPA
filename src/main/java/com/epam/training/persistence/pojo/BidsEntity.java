package com.epam.training.persistence.pojo;

import javax.persistence.*;


/**
 * Created by Oleg_Burshinov on 15.01.14.
 */
@Entity
@Table(name = "BIDS", schema = "OMPTEST", catalog = "")
public class BidsEntity {
    private Integer bidId;
    private Integer bidderId;
    private Integer itemId;
    private Integer bid;

    @Id
    @Column(name = "BID_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator="BID_ID_G")
    @SequenceGenerator(name="BID_ID_G", sequenceName="BID_ID_GEN")
    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    @Basic
    @Column(name = "BIDDER_ID")
    public Integer getBidderId() {
        return bidderId;
    }

    public void setBidderId(Integer bidderId) {
        this.bidderId = bidderId;
    }

    @Basic
    @Column(name = "ITEM_ID")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "BID")
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BidsEntity that = (BidsEntity) o;

        if (bid != null ? !bid.equals(that.bid) : that.bid != null) return false;
        if (bidId != null ? !bidId.equals(that.bidId) : that.bidId != null) return false;
        if (bidderId != null ? !bidderId.equals(that.bidderId) : that.bidderId != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bidId != null ? bidId.hashCode() : 0;
        result = 31 * result + (bidderId != null ? bidderId.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (bid != null ? bid.hashCode() : 0);
        return result;
    }
}
