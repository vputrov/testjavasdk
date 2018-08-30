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
import Aspose.Slides.Cloud.Sdk.Model.ResourceBase;
import Aspose.Slides.Cloud.Sdk.Model.ResourceUri;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents Format Scheme for slide&#39;s theme
 */
@ApiModel(description = "Represents Format Scheme for slide's theme")
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class FormatScheme extends ResourceBase {
  @SerializedName("BackgroundStyles")
  private List<ResourceUri> backgroundStyles = null;

  @SerializedName("EffectStyles")
  private List<ResourceUri> effectStyles = null;

  @SerializedName("FillStyles")
  private List<ResourceUri> fillStyles = null;

  @SerializedName("LineStyles")
  private List<ResourceUri> lineStyles = null;

  public FormatScheme backgroundStyles(List<ResourceUri> backgroundStyles) {
    this.backgroundStyles = backgroundStyles;
    return this;
  }

  public FormatScheme addBackgroundStylesItem(ResourceUri backgroundStylesItem) {
    if (this.backgroundStyles == null) {
      this.backgroundStyles = new ArrayList<ResourceUri>();
    }
    this.backgroundStyles.add(backgroundStylesItem);
    return this;
  }

   /**
   * Get backgroundStyles
   * @return backgroundStyles
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUri> getBackgroundStyles() {
    return backgroundStyles;
  }

  public void setBackgroundStyles(List<ResourceUri> backgroundStyles) {
    this.backgroundStyles = backgroundStyles;
  }

  public FormatScheme effectStyles(List<ResourceUri> effectStyles) {
    this.effectStyles = effectStyles;
    return this;
  }

  public FormatScheme addEffectStylesItem(ResourceUri effectStylesItem) {
    if (this.effectStyles == null) {
      this.effectStyles = new ArrayList<ResourceUri>();
    }
    this.effectStyles.add(effectStylesItem);
    return this;
  }

   /**
   * Get effectStyles
   * @return effectStyles
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUri> getEffectStyles() {
    return effectStyles;
  }

  public void setEffectStyles(List<ResourceUri> effectStyles) {
    this.effectStyles = effectStyles;
  }

  public FormatScheme fillStyles(List<ResourceUri> fillStyles) {
    this.fillStyles = fillStyles;
    return this;
  }

  public FormatScheme addFillStylesItem(ResourceUri fillStylesItem) {
    if (this.fillStyles == null) {
      this.fillStyles = new ArrayList<ResourceUri>();
    }
    this.fillStyles.add(fillStylesItem);
    return this;
  }

   /**
   * Get fillStyles
   * @return fillStyles
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUri> getFillStyles() {
    return fillStyles;
  }

  public void setFillStyles(List<ResourceUri> fillStyles) {
    this.fillStyles = fillStyles;
  }

  public FormatScheme lineStyles(List<ResourceUri> lineStyles) {
    this.lineStyles = lineStyles;
    return this;
  }

  public FormatScheme addLineStylesItem(ResourceUri lineStylesItem) {
    if (this.lineStyles == null) {
      this.lineStyles = new ArrayList<ResourceUri>();
    }
    this.lineStyles.add(lineStylesItem);
    return this;
  }

   /**
   * Get lineStyles
   * @return lineStyles
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUri> getLineStyles() {
    return lineStyles;
  }

  public void setLineStyles(List<ResourceUri> lineStyles) {
    this.lineStyles = lineStyles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatScheme formatScheme = (FormatScheme) o;
    return true && Objects.equals(this.backgroundStyles, formatScheme.backgroundStyles) && Objects.equals(this.effectStyles, formatScheme.effectStyles) && Objects.equals(this.fillStyles, formatScheme.fillStyles) && Objects.equals(this.lineStyles, formatScheme.lineStyles) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundStyles, effectStyles, fillStyles, lineStyles, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backgroundStyles: ").append(toIndentedString(backgroundStyles)).append("\n");
    sb.append("    effectStyles: ").append(toIndentedString(effectStyles)).append("\n");
    sb.append("    fillStyles: ").append(toIndentedString(fillStyles)).append("\n");
    sb.append("    lineStyles: ").append(toIndentedString(lineStyles)).append("\n");
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

