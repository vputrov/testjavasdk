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
@JsonAdapter(CombinedShapeType.Adapter.class)
public enum CombinedShapeType {
  
  Custom(0),
  
  Line(1),
  
  LineInverse(2),
  
  Triangle(3),
  
  RightTriangle(4),
  
  Rectangle(5),
  
  Diamond(6),
  
  Parallelogram(7),
  
  Trapezoid(8),
  
  NonIsoscelesTrapezoid(9),
  
  Pentagon(10),
  
  Hexagon(11),
  
  Heptagon(12),
  
  Octagon(13),
  
  Decagon(14),
  
  Dodecagon(15),
  
  FourPointedStar(16),
  
  FivePointedStar(17),
  
  SixPointedStar(18),
  
  SevenPointedStar(19),
  
  EightPointedStar(20),
  
  TenPointedStar(21),
  
  TwelvePointedStar(22),
  
  SixteenPointedStar(23),
  
  TwentyFourPointedStar(24),
  
  ThirtyTwoPointedStar(25),
  
  RoundCornerRectangle(26),
  
  OneRoundCornerRectangle(27),
  
  TwoSamesideRoundCornerRectangle(28),
  
  TwoDiagonalRoundCornerRectangle(29),
  
  OneSnipOneRoundCornerRectangle(30),
  
  OneSnipCornerRectangle(31),
  
  TwoSamesideSnipCornerRectangle(32),
  
  TwoDiagonalSnipCornerRectangle(33),
  
  Plaque(34),
  
  Ellipse(35),
  
  Teardrop(36),
  
  HomePlate(37),
  
  Chevron(38),
  
  PieWedge(39),
  
  Pie(40),
  
  BlockArc(41),
  
  Donut(42),
  
  NoSmoking(43),
  
  RightArrow(44),
  
  LeftArrow(45),
  
  UpArrow(46),
  
  DownArrow(47),
  
  StripedRightArrow(48),
  
  NotchedRightArrow(49),
  
  BentUpArrow(50),
  
  LeftRightArrow(51),
  
  UpDownArrow(52),
  
  LeftUpArrow(53),
  
  LeftRightUpArrow(54),
  
  QuadArrow(55),
  
  CalloutLeftArrow(56),
  
  CalloutRightArrow(57),
  
  CalloutUpArrow(58),
  
  CalloutDownArrow(59),
  
  CalloutLeftRightArrow(60),
  
  CalloutUpDownArrow(61),
  
  CalloutQuadArrow(62),
  
  BentArrow(63),
  
  UTurnArrow(64),
  
  CircularArrow(65),
  
  LeftCircularArrow(66),
  
  LeftRightCircularArrow(67),
  
  CurvedRightArrow(68),
  
  CurvedLeftArrow(69),
  
  CurvedUpArrow(70),
  
  CurvedDownArrow(71),
  
  SwooshArrow(72),
  
  Cube(73),
  
  Can(74),
  
  LightningBolt(75),
  
  Heart(76),
  
  Sun(77),
  
  Moon(78),
  
  SmileyFace(79),
  
  IrregularSeal1(80),
  
  IrregularSeal2(81),
  
  FoldedCorner(82),
  
  Bevel(83),
  
  Frame(84),
  
  HalfFrame(85),
  
  Corner(86),
  
  DiagonalStripe(87),
  
  Chord(88),
  
  CurvedArc(89),
  
  LeftBracket(90),
  
  RightBracket(91),
  
  LeftBrace(92),
  
  RightBrace(93),
  
  BracketPair(94),
  
  BracePair(95),
  
  StraightConnector1(96),
  
  BentConnector2(97),
  
  BentConnector3(98),
  
  BentConnector4(99),
  
  BentConnector5(100),
  
  CurvedConnector2(101),
  
  CurvedConnector3(102),
  
  CurvedConnector4(103),
  
  CurvedConnector5(104),
  
  Callout1(105),
  
  Callout2(106),
  
  Callout3(107),
  
  Callout1WithAccent(108),
  
  Callout2WithAccent(109),
  
  Callout3WithAccent(110),
  
  Callout1WithBorder(111),
  
  Callout2WithBorder(112),
  
  Callout3WithBorder(113),
  
  Callout1WithBorderAndAccent(114),
  
  Callout2WithBorderAndAccent(115),
  
  Callout3WithBorderAndAccent(116),
  
  CalloutWedgeRectangle(117),
  
  CalloutWedgeRoundRectangle(118),
  
  CalloutWedgeEllipse(119),
  
  CalloutCloud(120),
  
  Cloud(121),
  
  Ribbon(122),
  
  Ribbon2(123),
  
  EllipseRibbon(124),
  
  EllipseRibbon2(125),
  
  LeftRightRibbon(126),
  
  VerticalScroll(127),
  
  HorizontalScroll(128),
  
  Wave(129),
  
  DoubleWave(130),
  
  Plus(131),
  
  ProcessFlow(132),
  
  DecisionFlow(133),
  
  InputOutputFlow(134),
  
  PredefinedProcessFlow(135),
  
  InternalStorageFlow(136),
  
  DocumentFlow(137),
  
  MultiDocumentFlow(138),
  
  TerminatorFlow(139),
  
  PreparationFlow(140),
  
  ManualInputFlow(141),
  
  ManualOperationFlow(142),
  
  ConnectorFlow(143),
  
  PunchedCardFlow(144),
  
  PunchedTapeFlow(145),
  
  SummingJunctionFlow(146),
  
  OrFlow(147),
  
  CollateFlow(148),
  
  SortFlow(149),
  
  ExtractFlow(150),
  
  MergeFlow(151),
  
  OfflineStorageFlow(152),
  
  OnlineStorageFlow(153),
  
  MagneticTapeFlow(154),
  
  MagneticDiskFlow(155),
  
  MagneticDrumFlow(156),
  
  DisplayFlow(157),
  
  DelayFlow(158),
  
  AlternateProcessFlow(159),
  
  OffPageConnectorFlow(160),
  
  BlankButton(161),
  
  HomeButton(162),
  
  HelpButton(163),
  
  InformationButton(164),
  
  ForwardOrNextButton(165),
  
  BackOrPreviousButton(166),
  
  EndButton(167),
  
  BeginningButton(168),
  
  ReturnButton(169),
  
  DocumentButton(170),
  
  SoundButton(171),
  
  MovieButton(172),
  
  Gear6(173),
  
  Gear9(174),
  
  Funnel(175),
  
  PlusMath(176),
  
  MinusMath(177),
  
  MultiplyMath(178),
  
  DivideMath(179),
  
  EqualMath(180),
  
  NotEqualMath(181),
  
  CornerTabs(182),
  
  SquareTabs(183),
  
  PlaqueTabs(184),
  
  ChartX(185),
  
  ChartStar(186),
  
  ChartPlus(187),
  
  Chart(188),
  
  Table(189),
  
  PictureFrame(190),
  
  VideoFrame(191),
  
  AudioFrame(192),
  
  Diagram(193),
  
  OleObjectFrame(194),
  
  GroupShape(195),
  
  GraphicalObject(196),
  
  NotDefined(-1);

  private Integer value;

  CombinedShapeType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public static CombinedShapeType fromValue(String text) {
    for (CombinedShapeType b : CombinedShapeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CombinedShapeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CombinedShapeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CombinedShapeType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CombinedShapeType.fromValue(String.valueOf(value));
    }
  }
}

