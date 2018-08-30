/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package Aspose.Slides.Cloud.Sdk.Model;

import java.util.Objects;
import Aspose.Slides.Cloud.Sdk.Model.AudioVolumeMode;
import Aspose.Slides.Cloud.Sdk.Model.EffectFormat;
import Aspose.Slides.Cloud.Sdk.Model.FillFormat;
import Aspose.Slides.Cloud.Sdk.Model.GeometryShape;
import Aspose.Slides.Cloud.Sdk.Model.GeometryShapeType;
import Aspose.Slides.Cloud.Sdk.Model.LineFormat;
import Aspose.Slides.Cloud.Sdk.Model.ResourceUri;
import Aspose.Slides.Cloud.Sdk.Model.ResourceUriElement;
import Aspose.Slides.Cloud.Sdk.Model.VideoPlayModePreset;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Represents VideoFrame resource.
 */
@ApiModel(description = "Represents VideoFrame resource.")
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class VideoFrame extends GeometryShape {
  @SerializedName("FullScreenMode")
  private Boolean fullScreenMode = null;

  @SerializedName("HideAtShowing")
  private Boolean hideAtShowing = null;

  @SerializedName("PlayLoopMode")
  private Boolean playLoopMode = null;

  @SerializedName("PlayMode")
  private VideoPlayModePreset playMode = null;

  @SerializedName("RewindVideo")
  private Boolean rewindVideo = null;

  @SerializedName("Volume")
  private AudioVolumeMode volume = null;

  @SerializedName("Base64Data")
  private String base64Data = null;

  public VideoFrame fullScreenMode(Boolean fullScreenMode) {
    this.fullScreenMode = fullScreenMode;
    return this;
  }

   /**
   * Determines whether a video is shown in full screen mode.
   * @return fullScreenMode
  **/
  @ApiModelProperty(value = "Determines whether a video is shown in full screen mode.")
  public Boolean isFullScreenMode() {
    return fullScreenMode;
  }

  public void setFullScreenMode(Boolean fullScreenMode) {
    this.fullScreenMode = fullScreenMode;
  }

  public VideoFrame hideAtShowing(Boolean hideAtShowing) {
    this.hideAtShowing = hideAtShowing;
    return this;
  }

   /**
   * Determines whether a VideoFrame is hidden. 
   * @return hideAtShowing
  **/
  @ApiModelProperty(value = "Determines whether a VideoFrame is hidden. ")
  public Boolean isHideAtShowing() {
    return hideAtShowing;
  }

  public void setHideAtShowing(Boolean hideAtShowing) {
    this.hideAtShowing = hideAtShowing;
  }

  public VideoFrame playLoopMode(Boolean playLoopMode) {
    this.playLoopMode = playLoopMode;
    return this;
  }

   /**
   * Determines whether a video is looped.
   * @return playLoopMode
  **/
  @ApiModelProperty(value = "Determines whether a video is looped.")
  public Boolean isPlayLoopMode() {
    return playLoopMode;
  }

  public void setPlayLoopMode(Boolean playLoopMode) {
    this.playLoopMode = playLoopMode;
  }

  public VideoFrame playMode(VideoPlayModePreset playMode) {
    this.playMode = playMode;
    return this;
  }

   /**
   * Returns or sets the video play mode.  
   * @return playMode
  **/
  @ApiModelProperty(value = "Returns or sets the video play mode.  ")
  public VideoPlayModePreset getPlayMode() {
    return playMode;
  }

  public void setPlayMode(VideoPlayModePreset playMode) {
    this.playMode = playMode;
  }

  public VideoFrame rewindVideo(Boolean rewindVideo) {
    this.rewindVideo = rewindVideo;
    return this;
  }

   /**
   * Determines whether a video is automatically rewinded to start as soon as the movie has finished playing
   * @return rewindVideo
  **/
  @ApiModelProperty(value = "Determines whether a video is automatically rewinded to start as soon as the movie has finished playing")
  public Boolean isRewindVideo() {
    return rewindVideo;
  }

  public void setRewindVideo(Boolean rewindVideo) {
    this.rewindVideo = rewindVideo;
  }

  public VideoFrame volume(AudioVolumeMode volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Returns or sets the audio volume.
   * @return volume
  **/
  @ApiModelProperty(value = "Returns or sets the audio volume.")
  public AudioVolumeMode getVolume() {
    return volume;
  }

  public void setVolume(AudioVolumeMode volume) {
    this.volume = volume;
  }

  public VideoFrame base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

   /**
   * Video data encoded in base64.
   * @return base64Data
  **/
  @ApiModelProperty(value = "Video data encoded in base64.")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoFrame videoFrame = (VideoFrame) o;
    return true && Objects.equals(this.fullScreenMode, videoFrame.fullScreenMode) && Objects.equals(this.hideAtShowing, videoFrame.hideAtShowing) && Objects.equals(this.playLoopMode, videoFrame.playLoopMode) && Objects.equals(this.playMode, videoFrame.playMode) && Objects.equals(this.rewindVideo, videoFrame.rewindVideo) && Objects.equals(this.volume, videoFrame.volume) && Objects.equals(this.base64Data, videoFrame.base64Data) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullScreenMode, hideAtShowing, playLoopMode, playMode, rewindVideo, volume, base64Data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fullScreenMode: ").append(toIndentedString(fullScreenMode)).append("\n");
    sb.append("    hideAtShowing: ").append(toIndentedString(hideAtShowing)).append("\n");
    sb.append("    playLoopMode: ").append(toIndentedString(playLoopMode)).append("\n");
    sb.append("    playMode: ").append(toIndentedString(playMode)).append("\n");
    sb.append("    rewindVideo: ").append(toIndentedString(rewindVideo)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

