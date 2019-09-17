#! /usr/bin/env Rscript

library(effsize)

data <- read.csv("dataset2.csv")

pdf("dataset2.pdf", width=5, height=3)
par(mar=c(2,2,0.2,0.2)+0.1, mgp=c(-1,1,0))

boxplot(data$male, data$female, names=c("male", "femal"))

wilcox.test(data$male, data$female)

cohen.d(data$male, data$female)

cliff.delta(data$male, data$female)
