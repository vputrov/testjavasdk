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
 * MergingSource
 */
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class MergingSource {
  @SerializedName("Input")
  private InputFile input = null;

  @SerializedName("Slides")
  private List<Integer> slides = null;

  public MergingSource input(InputFile input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(value = "")
  public InputFile getInput() {
    return input;
  }

  public void setInput(InputFile input) {
    this.input = input;
  }

  public MergingSource slides(List<Integer> slides) {
    this.slides = slides;
    return this;
  }

  public MergingSource addSlidesItem(Integer slidesItem) {
    if (this.slides == null) {
      this.slides = new ArrayList<Integer>();
    }
    this.slides.add(slidesItem);
    return this;
  }

   /**
   * Get slides
   * @return slides
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getSlides() {
    return slides;
  }

  public void setSlides(List<Integer> slides) {
    this.slides = slides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergingSource mergingSource = (MergingSource) o;
    return true && Objects.equals(this.input, mergingSource.input) && Objects.equals(this.slides, mergingSource.slides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, slides);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergingSource {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    slides: ").append(toIndentedString(slides)).append("\n");
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

