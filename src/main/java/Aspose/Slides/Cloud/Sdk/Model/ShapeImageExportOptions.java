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
import Aspose.Slides.Cloud.Sdk.Model.ShapeThumbnailBounds;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides options that control how a shape is saved in thumbnail.
 */
@ApiModel(description = "Provides options that control how a shape is saved in thumbnail.")
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class ShapeImageExportOptions {
  @SerializedName("ScaleX")
  private Double scaleX = null;

  @SerializedName("ScaleY")
  private Double scaleY = null;

  @SerializedName("ThumbnailBounds")
  private ShapeThumbnailBounds thumbnailBounds = null;

  @SerializedName("Format")
  private String format = null;

  public ShapeImageExportOptions scaleX(Double scaleX) {
    this.scaleX = scaleX;
    return this;
  }

   /**
   * Get or sets scaling ratio by X axis.
   * @return scaleX
  **/
  @ApiModelProperty(required = true, value = "Get or sets scaling ratio by X axis.")
  public Double getScaleX() {
    return scaleX;
  }

  public void setScaleX(Double scaleX) {
    this.scaleX = scaleX;
  }

  public ShapeImageExportOptions scaleY(Double scaleY) {
    this.scaleY = scaleY;
    return this;
  }

   /**
   * Get or sets scaling ratio by Y axis.
   * @return scaleY
  **/
  @ApiModelProperty(required = true, value = "Get or sets scaling ratio by Y axis.")
  public Double getScaleY() {
    return scaleY;
  }

  public void setScaleY(Double scaleY) {
    this.scaleY = scaleY;
  }

  public ShapeImageExportOptions thumbnailBounds(ShapeThumbnailBounds thumbnailBounds) {
    this.thumbnailBounds = thumbnailBounds;
    return this;
  }

   /**
   * Get or sets thumbnail bounds
   * @return thumbnailBounds
  **/
  @ApiModelProperty(required = true, value = "Get or sets thumbnail bounds")
  public ShapeThumbnailBounds getThumbnailBounds() {
    return thumbnailBounds;
  }

  public void setThumbnailBounds(ShapeThumbnailBounds thumbnailBounds) {
    this.thumbnailBounds = thumbnailBounds;
  }

  public ShapeImageExportOptions format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Gets export format.
   * @return format
  **/
  @ApiModelProperty(value = "Gets export format.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShapeImageExportOptions shapeImageExportOptions = (ShapeImageExportOptions) o;
    return true && Objects.equals(this.scaleX, shapeImageExportOptions.scaleX) && Objects.equals(this.scaleY, shapeImageExportOptions.scaleY) && Objects.equals(this.thumbnailBounds, shapeImageExportOptions.thumbnailBounds) && Objects.equals(this.format, shapeImageExportOptions.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleX, scaleY, thumbnailBounds, format);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShapeImageExportOptions {\n");
    
    sb.append("    scaleX: ").append(toIndentedString(scaleX)).append("\n");
    sb.append("    scaleY: ").append(toIndentedString(scaleY)).append("\n");
    sb.append("    thumbnailBounds: ").append(toIndentedString(thumbnailBounds)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

