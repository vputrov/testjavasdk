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
package Aspose.Slides.Cloud.Sdk.Model.Request;

import java.util.List;
import Aspose.Slides.Cloud.Sdk.Model.*;


public class PostSlidesReorderPositionRequest {
  public PostSlidesReorderPositionRequest() {
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private Integer oldPosition;

  public Integer getOldPosition() {
    return oldPosition;
  }

  public void setOldPosition(Integer oldPosition) {
    this.oldPosition = oldPosition;
  }

  private Integer newPosition;

  public Integer getNewPosition() {
    return newPosition;
  }

  public void setNewPosition(Integer newPosition) {
    this.newPosition = newPosition;
  }

  private Integer slideToCopy;

  public Integer getSlideToCopy() {
    return slideToCopy;
  }

  public void setSlideToCopy(Integer slideToCopy) {
    this.slideToCopy = slideToCopy;
  }

  private Integer position;

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  private Integer slideToClone;

  public Integer getSlideToClone() {
    return slideToClone;
  }

  public void setSlideToClone(Integer slideToClone) {
    this.slideToClone = slideToClone;
  }

  private String source;

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  private String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String folder;

  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  private String storage;

  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  private String layoutAlias;

  public String getLayoutAlias() {
    return layoutAlias;
  }

  public void setLayoutAlias(String layoutAlias) {
    this.layoutAlias = layoutAlias;
  }

}
