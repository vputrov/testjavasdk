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


public class PostNotesSlideAddNewShapeRequest {
  public PostNotesSlideAddNewShapeRequest() {
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private Integer slideIndex;

  public Integer getSlideIndex() {
    return slideIndex;
  }

  public void setSlideIndex(Integer slideIndex) {
    this.slideIndex = slideIndex;
  }

  private String path;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  private ShapeBase dto;

  public ShapeBase getDto() {
    return dto;
  }

  public void setDto(ShapeBase dto) {
    this.dto = dto;
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

  private Integer shapeToClone;

  public Integer getShapeToClone() {
    return shapeToClone;
  }

  public void setShapeToClone(Integer shapeToClone) {
    this.shapeToClone = shapeToClone;
  }

  private Integer position;

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

}
