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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(SizeType.Adapter.class)
public enum SizeType {
  
  OnScreen(0),
  
  LetterPaper(1),
  
  A4Paper(2),
  
  Slide35mm(3),
  
  Overhead(4),
  
  Banner(5),
  
  Custom(6),
  
  Ledger(7),
  
  A3Paper(8),
  
  B4IsoPaper(9),
  
  B5IsoPaper(10),
  
  B4JisPaper(11),
  
  B5JisPaper(12),
  
  HagakiCard(13),
  
  OnScreen16x9(14),
  
  OnScreen16x10(15);

  private Integer value;

  SizeType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public static SizeType fromValue(String text) {
    for (SizeType b : SizeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SizeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SizeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SizeType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return SizeType.fromValue(String.valueOf(value));
    }
  }
}

