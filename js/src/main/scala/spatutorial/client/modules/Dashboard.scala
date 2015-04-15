package spatutorial.client.modules

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._
import spatutorial.client.components._

object Dashboard {
  // create the React component for Dashboard
  val component = ReactComponentB[MainRouter.Router]("Dashboard")
    .render(router => {
    // create dummy data for the chart
    val cp = Chart.ChartProps("Test chart", Chart.LineChart, ChartData(Seq("A", "B", "C", "D"), Seq(ChartDataset(Seq(1, 4, 3, 5), "Data1"))))
    <.div(
      // header, MessageOfTheDay and chart components
      <.h2("Dashboard"),
      Motd(),
      Chart(cp),
      // create a link to the Todo view
      <.div(MainRouter.todoLink("Check your todos!"))
    )
  }).build
}
