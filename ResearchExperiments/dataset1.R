#! /usr/bin/env Rscript

data <- read.csv("dataset1.csv")

pdf("dataset1.pdf", width=3, height=5)
par(mar=c(0.2,2,0.2,0.2)+0.1, mgp=c(-1,1,0))

boxplot(data$Age, names=c("Age"), outline=F)
