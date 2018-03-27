package org.exoplatform.gamification.service.dto.configuration;

import org.exoplatform.gamification.entities.domain.configuration.BadgeEntity;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Date;

public class BadgeDTO {


    protected Long id;

    @NotBlank
    @Size(min = 10, max = 50)
    protected String title;

    @Size(min = 10, max = 256)
    protected String description;

    protected int neededScore;

    protected String icon;

    protected Date startValidityDate;

    protected Date endValidityDate;

    protected boolean isEnabled;

    private String createdBy;

    private Date createdDate;

    private String lastModifiedBy;

    private Date lastModifiedDate;

    public BadgeDTO(BadgeEntity badgeEntity) {

        this.id = badgeEntity.getId();

        this.title = badgeEntity.getTitle();

        this.icon = badgeEntity.getIcon();

        this.neededScore = badgeEntity.getNeededScore();

        this.startValidityDate = badgeEntity.getStartValidityDate();

        this.endValidityDate = badgeEntity.getEndValidityDate();

        this.isEnabled = badgeEntity.isEnabled();

        this.description = badgeEntity.getDescription();

        this.createdBy = badgeEntity.getCreatedBy();

        this.createdDate = badgeEntity.getCreatedDate();

        this.lastModifiedBy = badgeEntity.getLastModifiedBy();

        this.lastModifiedDate = badgeEntity.getLastModifiedDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNeededScore() {
        return neededScore;
    }

    public void setNeededScore(int neededScore) {
        this.neededScore = neededScore;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getStartValidityDate() {
        return startValidityDate;
    }

    public void setStartValidityDate(Date startValidityDate) {
        this.startValidityDate = startValidityDate;
    }

    public Date getEndValidityDate() {
        return endValidityDate;
    }

    public void setEndValidityDate(Date endValidityDate) {
        this.endValidityDate = endValidityDate;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        return "BadgeDTO{" +
                "title='" + title + '\'' +
                ", needed score='" + neededScore + '\'' +
                ", start validity date='" + startValidityDate + '\'' +
                ", end validity date='" + endValidityDate + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", isEnabled=" + isEnabled +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                "}";
    }
}
