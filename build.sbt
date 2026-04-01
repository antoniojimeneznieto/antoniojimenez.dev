enablePlugins(LaikaPlugin)

name := "blog"
version := "0.1.0"

laikaTheme := laika.theme.Theme.empty

import laika.config.SyntaxHighlighting
import laika.format.Markdown

laikaConfig := laikaConfig.value.withRawContent
