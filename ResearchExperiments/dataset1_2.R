#! /usr/bin/env Rscript

library(vioplot)

data <- read.csv("dataset1.csv")

pdf("dataset1_2.pdf", width=3, height=5)
par(mar=c(0.2,2,0.2,0.2)+0.1, mgp=c(-1,1,0))

vioplot(data$Age)
