package info.pelleritoudacity.android.rcapstone.data.model.reddit;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OembedMedia implements Parcelable
{

    @SerializedName("provider_url")
    @Expose
    private String providerUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("html")
    @Expose
    private String html;
    @SerializedName("author_name")
    @Expose
    private String authorName;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("thumbnail_width")
    @Expose
    private Integer thumbnailWidth;
    @SerializedName("provider_name")
    @Expose
    private String providerName;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("thumbnail_height")
    @Expose
    private Integer thumbnailHeight;
    @SerializedName("author_url")
    @Expose
    private String authorUrl;
    public final static Parcelable.Creator<OembedMedia> CREATOR = new Creator<OembedMedia>() {


        @SuppressWarnings({
            "unchecked"
        })
        public OembedMedia createFromParcel(Parcel in) {
            return new OembedMedia(in);
        }

        public OembedMedia[] newArray(int size) {
            return (new OembedMedia[size]);
        }

    }
    ;

    @SuppressWarnings("SpellCheckingInspection")
    OembedMedia(Parcel in) {
        this.providerUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.html = ((String) in.readValue((String.class.getClassLoader())));
        this.authorName = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.version = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailWidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.providerName = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailHeight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.authorUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public OembedMedia() {
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    @SuppressWarnings("unused")
    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getTitle() {
        return title;
    }

    @SuppressWarnings("unused")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    @SuppressWarnings("unused")
    public void setType(String type) {
        this.type = type;
    }

    public String getHtml() {
        return html;
    }

    @SuppressWarnings("unused")
    public void setHtml(String html) {
        this.html = html;
    }

    public String getAuthorName() {
        return authorName;
    }

    @SuppressWarnings("unused")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getHeight() {
        return height;
    }

    @SuppressWarnings("unused")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    @SuppressWarnings("unused")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getVersion() {
        return version;
    }

    @SuppressWarnings("unused")
    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    @SuppressWarnings("unused")
    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    @SuppressWarnings("unused")
    public String getProviderName() {
        return providerName;
    }

    @SuppressWarnings("unused")
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @SuppressWarnings("unused")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    @SuppressWarnings("unused")
    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    @SuppressWarnings("unused")
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(providerUrl);
        dest.writeValue(title);
        dest.writeValue(type);
        dest.writeValue(html);
        dest.writeValue(authorName);
        dest.writeValue(height);
        dest.writeValue(width);
        dest.writeValue(version);
        dest.writeValue(thumbnailWidth);
        dest.writeValue(providerName);
        dest.writeValue(thumbnailUrl);
        dest.writeValue(thumbnailHeight);
        dest.writeValue(authorUrl);
    }

    public int describeContents() {
        return  0;
    }

}
