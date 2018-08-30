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
import Aspose.Slides.Cloud.Sdk.Model.InputFile;
import Aspose.Slides.Cloud.Sdk.Model.Task;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddLayoutSlide
 */
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class AddLayoutSlide extends Task {
  @SerializedName("CloneFromFile")
  private InputFile cloneFromFile = null;

  @SerializedName("CloneFromPosition")
  private Integer cloneFromPosition = null;

  public AddLayoutSlide cloneFromFile(InputFile cloneFromFile) {
    this.cloneFromFile = cloneFromFile;
    return this;
  }

   /**
   * Get cloneFromFile
   * @return cloneFromFile
  **/
  @ApiModelProperty(value = "")
  public InputFile getCloneFromFile() {
    return cloneFromFile;
  }

  public void setCloneFromFile(InputFile cloneFromFile) {
    this.cloneFromFile = cloneFromFile;
  }

  public AddLayoutSlide cloneFromPosition(Integer cloneFromPosition) {
    this.cloneFromPosition = cloneFromPosition;
    return this;
  }

   /**
   * Get cloneFromPosition
   * @return cloneFromPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getCloneFromPosition() {
    return cloneFromPosition;
  }

  public void setCloneFromPosition(Integer cloneFromPosition) {
    this.cloneFromPosition = cloneFromPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLayoutSlide addLayoutSlide = (AddLayoutSlide) o;
    return true && Objects.equals(this.cloneFromFile, addLayoutSlide.cloneFromFile) && Objects.equals(this.cloneFromPosition, addLayoutSlide.cloneFromPosition) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneFromFile, cloneFromPosition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLayoutSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloneFromFile: ").append(toIndentedString(cloneFromFile)).append("\n");
    sb.append("    cloneFromPosition: ").append(toIndentedString(cloneFromPosition)).append("\n");
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

