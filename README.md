# JavaPrimitives
### Primitives Documentation: Alec Garza

I kept my Primitives assignment simple. It ended up being half java GUIs and primatives, and half me relearning java. I tried doing this last year, but was unable to finish. So, this year I took my old, hoplessly busted code, fixed it and added on to it. I learned how to use buttons and comboBoxes with lines, arcs, rectangles, and ovals. I have made something that uses drawing before and was going to add that function to my little drawing program, but my computer refuses to let me into putty or winscp. So, who knows if I'll even be able to update the code in this repo to the current version.
  
Thanks to the tesla servers keeping me from working, and my own procrastination, my drawing program hs two features. You can select a Line, Rectangle, Oval, or Arc from a list, then press a button to draw one of random size/orientation. The second feature is changing the color of whatever shape you want. You can use black, red, blue, or green from a list and confirm it with the change color button. Then te next thing you draw will be in that color.

There were a couple things that I struggled with while creating this program. The only one that I didnt fix is that when you open the list to change the shape or color, it draws another random shape. It does not overwrite what is on the canvas, but its as if each combo box has its own tiny canvas behind it. I "solved" this poble by moving the canvas down far enough that there was no chance the menu would overlap. Changing it from a chanceto have part of a shape, to there's probably a hidden shape but it will never be seen. The other main problems we buttonsnot wanting to share their information, but after enough trial and error, it got sorted out. I did not seperate my classes into different files because my code from last year had them together and I didn't have the time to seperate them, because I don't know how to copy/paste in vim. The java file is called Flow becuase I was originally just going to use this file to test flowLayout, but that ended up not being needed so I just went with he name anyway.

When I got home from work today, I tried to use putty amd thought my computer bricked itself. Everything else works fine though. Tried it on my laptop and it was the same thing. DownDetector.com desn't work for IU's tesla servers so I can only guess, but it would seem I do not get to finish my plans. What I was planning to do was to add the mouse drawing like I mentioned before, and add a fill draw for the shapes. I also wanted to have user text input used in g.drawString(), but that was only if time allowed, which it certainly does not anymore. Now I plan to sit around and hope that the servers come back up long enogh for me to copy my files to github and submit before the deadline.
