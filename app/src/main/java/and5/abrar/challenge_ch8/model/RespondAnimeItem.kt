package and5.abrar.challenge_ch8.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class RespondAnimeItem(
    @SerializedName("genre")
    val genre: List<String>,
    @SerializedName("link")
    val link: Link,
    @SerializedName("release")
    val release: String,
    @SerializedName("title")
    val title: String
):Parcelable