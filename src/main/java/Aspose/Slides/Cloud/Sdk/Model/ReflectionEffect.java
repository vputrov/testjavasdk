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
import Aspose.Slides.Cloud.Sdk.Model.RectangleAlignment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents reflection effect 
 */
@ApiModel(description = "Represents reflection effect ")
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class ReflectionEffect {
  @SerializedName("Direction")
  private Double direction = null;

  @SerializedName("FadeDirection")
  private Double fadeDirection = null;

  @SerializedName("Distance")
  private Double distance = null;

  @SerializedName("BlurRadius")
  private Double blurRadius = null;

  @SerializedName("ScaleHorizontal")
  private Double scaleHorizontal = null;

  @SerializedName("ScaleVertical")
  private Double scaleVertical = null;

  @SerializedName("SkewHorizontal")
  private Double skewHorizontal = null;

  @SerializedName("SkewVertical")
  private Double skewVertical = null;

  @SerializedName("StartPosAlpha")
  private Double startPosAlpha = null;

  @SerializedName("EndPosAlpha")
  private Double endPosAlpha = null;

  @SerializedName("StartReflectionOpacity")
  private Double startReflectionOpacity = null;

  @SerializedName("EndReflectionOpacity")
  private Double endReflectionOpacity = null;

  @SerializedName("RectangleAlign")
  private RectangleAlignment rectangleAlign = null;

  @SerializedName("RotateShadowWithShape")
  private Boolean rotateShadowWithShape = null;

  public ReflectionEffect direction(Double direction) {
    this.direction = direction;
    return this;
  }

   /**
   * direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "direction")
  public Double getDirection() {
    return direction;
  }

  public void setDirection(Double direction) {
    this.direction = direction;
  }

  public ReflectionEffect fadeDirection(Double fadeDirection) {
    this.fadeDirection = fadeDirection;
    return this;
  }

   /**
   * fade direction
   * @return fadeDirection
  **/
  @ApiModelProperty(required = true, value = "fade direction")
  public Double getFadeDirection() {
    return fadeDirection;
  }

  public void setFadeDirection(Double fadeDirection) {
    this.fadeDirection = fadeDirection;
  }

  public ReflectionEffect distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * distance
   * @return distance
  **/
  @ApiModelProperty(required = true, value = "distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public ReflectionEffect blurRadius(Double blurRadius) {
    this.blurRadius = blurRadius;
    return this;
  }

   /**
   * blur radius
   * @return blurRadius
  **/
  @ApiModelProperty(required = true, value = "blur radius")
  public Double getBlurRadius() {
    return blurRadius;
  }

  public void setBlurRadius(Double blurRadius) {
    this.blurRadius = blurRadius;
  }

  public ReflectionEffect scaleHorizontal(Double scaleHorizontal) {
    this.scaleHorizontal = scaleHorizontal;
    return this;
  }

   /**
   * scale horizontal
   * @return scaleHorizontal
  **/
  @ApiModelProperty(required = true, value = "scale horizontal")
  public Double getScaleHorizontal() {
    return scaleHorizontal;
  }

  public void setScaleHorizontal(Double scaleHorizontal) {
    this.scaleHorizontal = scaleHorizontal;
  }

  public ReflectionEffect scaleVertical(Double scaleVertical) {
    this.scaleVertical = scaleVertical;
    return this;
  }

   /**
   * scale vertical
   * @return scaleVertical
  **/
  @ApiModelProperty(required = true, value = "scale vertical")
  public Double getScaleVertical() {
    return scaleVertical;
  }

  public void setScaleVertical(Double scaleVertical) {
    this.scaleVertical = scaleVertical;
  }

  public ReflectionEffect skewHorizontal(Double skewHorizontal) {
    this.skewHorizontal = skewHorizontal;
    return this;
  }

   /**
   * skew horizontal
   * @return skewHorizontal
  **/
  @ApiModelProperty(required = true, value = "skew horizontal")
  public Double getSkewHorizontal() {
    return skewHorizontal;
  }

  public void setSkewHorizontal(Double skewHorizontal) {
    this.skewHorizontal = skewHorizontal;
  }

  public ReflectionEffect skewVertical(Double skewVertical) {
    this.skewVertical = skewVertical;
    return this;
  }

   /**
   * skew vertical
   * @return skewVertical
  **/
  @ApiModelProperty(required = true, value = "skew vertical")
  public Double getSkewVertical() {
    return skewVertical;
  }

  public void setSkewVertical(Double skewVertical) {
    this.skewVertical = skewVertical;
  }

  public ReflectionEffect startPosAlpha(Double startPosAlpha) {
    this.startPosAlpha = startPosAlpha;
    return this;
  }

   /**
   * start pos alpha
   * @return startPosAlpha
  **/
  @ApiModelProperty(required = true, value = "start pos alpha")
  public Double getStartPosAlpha() {
    return startPosAlpha;
  }

  public void setStartPosAlpha(Double startPosAlpha) {
    this.startPosAlpha = startPosAlpha;
  }

  public ReflectionEffect endPosAlpha(Double endPosAlpha) {
    this.endPosAlpha = endPosAlpha;
    return this;
  }

   /**
   * end pos alpha
   * @return endPosAlpha
  **/
  @ApiModelProperty(required = true, value = "end pos alpha")
  public Double getEndPosAlpha() {
    return endPosAlpha;
  }

  public void setEndPosAlpha(Double endPosAlpha) {
    this.endPosAlpha = endPosAlpha;
  }

  public ReflectionEffect startReflectionOpacity(Double startReflectionOpacity) {
    this.startReflectionOpacity = startReflectionOpacity;
    return this;
  }

   /**
   * start reflection opacity
   * @return startReflectionOpacity
  **/
  @ApiModelProperty(required = true, value = "start reflection opacity")
  public Double getStartReflectionOpacity() {
    return startReflectionOpacity;
  }

  public void setStartReflectionOpacity(Double startReflectionOpacity) {
    this.startReflectionOpacity = startReflectionOpacity;
  }

  public ReflectionEffect endReflectionOpacity(Double endReflectionOpacity) {
    this.endReflectionOpacity = endReflectionOpacity;
    return this;
  }

   /**
   * end reflection opacity
   * @return endReflectionOpacity
  **/
  @ApiModelProperty(required = true, value = "end reflection opacity")
  public Double getEndReflectionOpacity() {
    return endReflectionOpacity;
  }

  public void setEndReflectionOpacity(Double endReflectionOpacity) {
    this.endReflectionOpacity = endReflectionOpacity;
  }

  public ReflectionEffect rectangleAlign(RectangleAlignment rectangleAlign) {
    this.rectangleAlign = rectangleAlign;
    return this;
  }

   /**
   * rectangle alignment
   * @return rectangleAlign
  **/
  @ApiModelProperty(required = true, value = "rectangle alignment")
  public RectangleAlignment getRectangleAlign() {
    return rectangleAlign;
  }

  public void setRectangleAlign(RectangleAlignment rectangleAlign) {
    this.rectangleAlign = rectangleAlign;
  }

  public ReflectionEffect rotateShadowWithShape(Boolean rotateShadowWithShape) {
    this.rotateShadowWithShape = rotateShadowWithShape;
    return this;
  }

   /**
   * true if the reflection should rotate with the shape when the shape is rotated
   * @return rotateShadowWithShape
  **/
  @ApiModelProperty(required = true, value = "true if the reflection should rotate with the shape when the shape is rotated")
  public Boolean isRotateShadowWithShape() {
    return rotateShadowWithShape;
  }

  public void setRotateShadowWithShape(Boolean rotateShadowWithShape) {
    this.rotateShadowWithShape = rotateShadowWithShape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReflectionEffect reflectionEffect = (ReflectionEffect) o;
    return true && Objects.equals(this.direction, reflectionEffect.direction) && Objects.equals(this.fadeDirection, reflectionEffect.fadeDirection) && Objects.equals(this.distance, reflectionEffect.distance) && Objects.equals(this.blurRadius, reflectionEffect.blurRadius) && Objects.equals(this.scaleHorizontal, reflectionEffect.scaleHorizontal) && Objects.equals(this.scaleVertical, reflectionEffect.scaleVertical) && Objects.equals(this.skewHorizontal, reflectionEffect.skewHorizontal) && Objects.equals(this.skewVertical, reflectionEffect.skewVertical) && Objects.equals(this.startPosAlpha, reflectionEffect.startPosAlpha) && Objects.equals(this.endPosAlpha, reflectionEffect.endPosAlpha) && Objects.equals(this.startReflectionOpacity, reflectionEffect.startReflectionOpacity) && Objects.equals(this.endReflectionOpacity, reflectionEffect.endReflectionOpacity) && Objects.equals(this.rectangleAlign, reflectionEffect.rectangleAlign) && Objects.equals(this.rotateShadowWithShape, reflectionEffect.rotateShadowWithShape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, fadeDirection, distance, blurRadius, scaleHorizontal, scaleVertical, skewHorizontal, skewVertical, startPosAlpha, endPosAlpha, startReflectionOpacity, endReflectionOpacity, rectangleAlign, rotateShadowWithShape);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReflectionEffect {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    fadeDirection: ").append(toIndentedString(fadeDirection)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    blurRadius: ").append(toIndentedString(blurRadius)).append("\n");
    sb.append("    scaleHorizontal: ").append(toIndentedString(scaleHorizontal)).append("\n");
    sb.append("    scaleVertical: ").append(toIndentedString(scaleVertical)).append("\n");
    sb.append("    skewHorizontal: ").append(toIndentedString(skewHorizontal)).append("\n");
    sb.append("    skewVertical: ").append(toIndentedString(skewVertical)).append("\n");
    sb.append("    startPosAlpha: ").append(toIndentedString(startPosAlpha)).append("\n");
    sb.append("    endPosAlpha: ").append(toIndentedString(endPosAlpha)).append("\n");
    sb.append("    startReflectionOpacity: ").append(toIndentedString(startReflectionOpacity)).append("\n");
    sb.append("    endReflectionOpacity: ").append(toIndentedString(endReflectionOpacity)).append("\n");
    sb.append("    rectangleAlign: ").append(toIndentedString(rectangleAlign)).append("\n");
    sb.append("    rotateShadowWithShape: ").append(toIndentedString(rotateShadowWithShape)).append("\n");
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

