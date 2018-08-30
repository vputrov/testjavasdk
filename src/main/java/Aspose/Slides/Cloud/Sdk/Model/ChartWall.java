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
import Aspose.Slides.Cloud.Sdk.Model.EffectFormat;
import Aspose.Slides.Cloud.Sdk.Model.FillFormat;
import Aspose.Slides.Cloud.Sdk.Model.LineFormat;
import Aspose.Slides.Cloud.Sdk.Model.PictureType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a chart wall
 */
@ApiModel(description = "Represents a chart wall")
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class ChartWall {
  @SerializedName("FillFormat")
  private FillFormat fillFormat = null;

  @SerializedName("EffectFormat")
  private EffectFormat effectFormat = null;

  @SerializedName("LineFormat")
  private LineFormat lineFormat = null;

  @SerializedName("Thickness")
  private Integer thickness = null;

  @SerializedName("PictureType")
  private PictureType pictureType = null;

  public ChartWall fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Get or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public ChartWall effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Get or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public ChartWall lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Get or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }

  public ChartWall thickness(Integer thickness) {
    this.thickness = thickness;
    return this;
  }

   /**
   * Get or sets wall thickness as a percentage of the largest dimension of the plot volume.
   * @return thickness
  **/
  @ApiModelProperty(required = true, value = "Get or sets wall thickness as a percentage of the largest dimension of the plot volume.")
  public Integer getThickness() {
    return thickness;
  }

  public void setThickness(Integer thickness) {
    this.thickness = thickness;
  }

  public ChartWall pictureType(PictureType pictureType) {
    this.pictureType = pictureType;
    return this;
  }

   /**
   * Get or sets mode of bar picture filling.
   * @return pictureType
  **/
  @ApiModelProperty(required = true, value = "Get or sets mode of bar picture filling.")
  public PictureType getPictureType() {
    return pictureType;
  }

  public void setPictureType(PictureType pictureType) {
    this.pictureType = pictureType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartWall chartWall = (ChartWall) o;
    return true && Objects.equals(this.fillFormat, chartWall.fillFormat) && Objects.equals(this.effectFormat, chartWall.effectFormat) && Objects.equals(this.lineFormat, chartWall.lineFormat) && Objects.equals(this.thickness, chartWall.thickness) && Objects.equals(this.pictureType, chartWall.pictureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillFormat, effectFormat, lineFormat, thickness, pictureType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartWall {\n");
    
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
    sb.append("    thickness: ").append(toIndentedString(thickness)).append("\n");
    sb.append("    pictureType: ").append(toIndentedString(pictureType)).append("\n");
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

