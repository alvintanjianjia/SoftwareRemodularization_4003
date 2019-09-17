#! /usr/bin/env Rscript

library(ggplot2)

data <- read.csv("dataset3.csv")

ggplot(data, aes(y=delay, x=datasets)) +
  geom_violin(trim=FALSE, fill="gray") +
  theme_classic() + 
  geom_boxplot(width=0.1) + 
  stat_summary(aes(group=1), fun.y=mean, geom="point", color="red")

ggsave("dataset3.pdf", width=5, height=2)
