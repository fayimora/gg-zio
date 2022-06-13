import zio.*
import zio.config.*
import typesafe.*
import magnolia.*
import ConfigDescriptor.*
import com.typesafe.config.ConfigFactory
import zio.Console.printLine

object Main extends ZIOAppDefault:
  private implicit val configDescriptor: _root_.zio.config.ConfigDescriptor[CrawlerConfig] = descriptor[CrawlerConfig]

  override def run =
    for
      conf <- read(
        configDescriptor.from(ConfigSource.fromTypesafeConfig(
          ZIO.attempt(ConfigFactory.defaultApplication())
        ))
      )
      _ <- printLine(s"Conf is $conf")
    yield ()
    
//    for
//      config <- read(CrawlerConfig.descriptor.from(CrawlerConfig.source))
//      _ <- printLine(config)
//    yield ()
//    printLine("Welcome to your first ZIO app!").exitCode
