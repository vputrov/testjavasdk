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
import Aspose.Slides.Cloud.Sdk.Model.ResourceUriElement;
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
 * Represents list of Links to Paragraphs resources
 */
@ApiModel(description = "Represents list of Links to Paragraphs resources")
@javax.annotation.Generated(value = "com.aspose.codegen.JavaAsposeGenerator", date = "2018-08-30T16:25:55.889+03:00")
public class ParagraphList extends ResourceBase {
  @SerializedName("ParagraphLinks")
  private List<ResourceUriElement> paragraphLinks = null;

  public ParagraphList paragraphLinks(List<ResourceUriElement> paragraphLinks) {
    this.paragraphLinks = paragraphLinks;
    return this;
  }

  public ParagraphList addParagraphLinksItem(ResourceUriElement paragraphLinksItem) {
    if (this.paragraphLinks == null) {
      this.paragraphLinks = new ArrayList<ResourceUriElement>();
    }
    this.paragraphLinks.add(paragraphLinksItem);
    return this;
  }

   /**
   * Get paragraphLinks
   * @return paragraphLinks
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUriElement> getParagraphLinks() {
    return paragraphLinks;
  }

  public void setParagraphLinks(List<ResourceUriElement> paragraphLinks) {
    this.paragraphLinks = paragraphLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParagraphList paragraphList = (ParagraphList) o;
    return true && Objects.equals(this.paragraphLinks, paragraphList.paragraphLinks) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paragraphLinks, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paragraphLinks: ").append(toIndentedString(paragraphLinks)).append("\n");
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

